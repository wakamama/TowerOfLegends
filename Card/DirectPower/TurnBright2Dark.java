package DirectPower;

import stonePanel.Stone;
import stonePanel.TurningStonePanel;

public class TurnBright2Dark extends Power{
	//constructor
	public TurnBright2Dark() {
		super();
		this.skillName = "����t";
	}

	//implements abstract method
	public void activatedPower() {
		if(TurningStonePanel.tspREF != null){
			int[][] allGridID = TurningStonePanel.tspREF.panel.getAllGridID();
			int row = allGridID.length;
			int col = allGridID[0].length;  //since it's square all column numbers are same
		
			//find bright stone and turn it into dark
			for(int i=0; i<row; i++){
				for(int j=0; j<col; j++){
					if(TurningStonePanel.tspREF.getStone(i, j).getType() == Stone.BRIGHT)
						TurningStonePanel.tspREF.getStone(i, j).setTypeItSelf(Stone.DARK);
				}
			}
		}
	}

	@Override
	public String getSkillName() {
		return this.skillName;
	}
}
