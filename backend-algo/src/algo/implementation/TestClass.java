package algo.implementation;

import java.util.ArrayList;

import algo.utils.StationCode;
import algo.utils.StationNodeUtil;
import algo.utils.StationType;

public class TestClass {

	public static void main(String[] args) {
		
		ArrayList<StationCode> patnaAdjacent = new ArrayList<>();
		patnaAdjacent.add(StationCode.NDLS);
		patnaAdjacent.add(StationCode.HWH);
		StationNodeUtil.addStationNode(StationCode.PNBE, StationType.MAJOR, patnaAdjacent);
		
		ArrayList<StationCode> masAdjacent = new ArrayList<>();
		masAdjacent.add(StationCode.BLR);
		masAdjacent.add(StationCode.HWH);
		StationNodeUtil.addStationNode(StationCode.MAS, StationType.MAJOR, masAdjacent);
		
		ArrayList<StationCode> blrAdjacent = new ArrayList<>();
		blrAdjacent.add(StationCode.MAS);		
		blrAdjacent.add(StationCode.NDLS);		
		StationNodeUtil.addStationNode(StationCode.BLR, StationType.MAJOR, blrAdjacent);
		
		StationNodeUtil.printStationGraph();

	}

}
