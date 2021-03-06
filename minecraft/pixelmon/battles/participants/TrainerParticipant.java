package pixelmon.battles.participants;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import pixelmon.battles.BattleController;
import pixelmon.battles.attacks.Attack;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.entities.trainers.EntityTrainer;

public class TrainerParticipant implements IBattleParticipant {

	public EntityTrainer trainer;
	private BattleController bc;

	public TrainerParticipant(EntityTrainer trainer, EntityPlayer opponent) {
		this.trainer = trainer;
		trainer.releasePokemon();
		trainer.startBattle(opponent);
	}

	@Override
	public ParticipantType getType() {
		return ParticipantType.Trainer;
	}

	@Override
	public void setBattleController(BattleController bc) {
		this.bc = bc;
	}

	@Override
	public void StartBattle(IBattleParticipant opponent) {
	}

	@Override
	public EntityPixelmon currentPokemon() {
		return trainer.releasedPokemon;
	}

	@Override
	public boolean hasMorePokemon() {
		return trainer.hasAblePokemon();
	}

	@Override
	public boolean canGainXP() {
		return false;
	}

	@Override
	public void EndBattle(boolean didWin, IBattleParticipant foe) {
		if (didWin) {
			trainer.releasedPokemon.battleStats.clearBattleStats();
			trainer.releasedPokemon.EndBattle();
			trainer.healAllPokemon();
			this.trainer.setAttackTarget(null);
			trainer.releasedPokemon.status.clear();
			trainer.releasedPokemon.setDead();
			trainer.winBattle(foe.currentPokemon().getOwner());
		} else {
			trainer.loseBattle(foe.currentPokemon().getOwner());
			if (trainer.releasedPokemon != null)
				trainer.releasedPokemon.EndBattle();
			trainer.setDead();
		}
		trainer.releasedPokemon = null;
	}

	@Override
	public void getNextPokemon(IBattleParticipant opponent) {
		bc.SwitchPokemon(currentPokemon(), trainer.getNextPokemonID());
	}

	@Override
	public boolean getIsFaintedOrDead() {
		return trainer.releasedPokemon == null || trainer.releasedPokemon.isDead || trainer.releasedPokemon.isFainted || trainer.releasedPokemon.getHealth() <= 0;
	}

	@Override
	public String getName() {
		return trainer.info.name;
	}

	@Override
	public Attack getMove(IBattleParticipant participant2) {
		return Attack.getWhichMoveIsBest(trainer.releasedPokemon.moveset, participant2.currentPokemon().type, trainer.releasedPokemon, participant2.currentPokemon());
	}

	@Override
	public void switchPokemon(IBattleParticipant opponent, int newPixelmonId) {
		currentPokemon().battleStats.clearBattleStats();
		if (!currentPokemon().isFainted) {
			ChatHandler.sendBattleMessage(opponent.currentPokemon().getOwner(), trainer.info.name + " withdrew " + currentPokemon().getNickname() + "!");
		}
		currentPokemon().catchInPokeball();
		trainer.pokemonStorage.getNBT(currentPokemon().getPokemonId()).setBoolean("IsFainted", true);

		trainer.releasePokemon();

		ChatHandler.sendBattleMessage(opponent.currentPokemon().getOwner(), trainer.info.name + " sent out " + currentPokemon().getNickname() + "!");

		if (opponent instanceof PlayerParticipant) {
			ChatHandler.sendBattleMessage(((PlayerParticipant) opponent).player, trainer.getName() + " sent out " + currentPokemon().getName());
		}
		opponent.updateOpponent(this);
	}

	@Override
	public boolean checkPokemon() {
		for (NBTTagCompound n : trainer.pokemonStorage.partyPokemon) {
			if (n != null && n.getInteger("PixelmonNumberMoves") == 0) {
				System.out.println("Couldn't load pokemon's moves");
				return false;
			}
		}
		return true;
	}

	@Override
	public void updatePokemon() {
		trainer.pokemonStorage.getNBT(currentPokemon().getPokemonId()).setBoolean("IsFainted", true);
	}

	@Override
	public void update() {
	}

	@Override
	public EntityLiving getEntity() {
		return trainer;
	}

	@Override
	public void updateOpponent(IBattleParticipant opponent) {
	}
}
