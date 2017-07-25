# Projet de Chat

	public class Army implements IArmy {
	
		int readyTroops=0;
		int movedTroops=0;
		House house;
		Tile position;
		ArmyState state = ArmyState.IDLE;
	}