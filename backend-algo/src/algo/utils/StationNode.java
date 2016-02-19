package algo.utils;

import java.util.ArrayList;

public class StationNode {

	StationCode stationCode;		
	StationType stationType;	
	ArrayList<StationCode> adjacencyList;
	

	//Construct a StationNode
	public StationNode(StationCode code, StationType type, ArrayList<StationCode> adjacencyList)
	{
		stationType = type;
		stationCode = code;
		this.adjacencyList = adjacencyList;
	}
	
	
	
	public StationType getStationType() {
		return stationType;
	}


	public void setStationType(StationType stationType) {
		this.stationType = stationType;
	}


	public ArrayList<StationCode> getAdjacencyList() {
		return adjacencyList;
	}


	public void setAdjacencyList(ArrayList<StationCode> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	public StationCode getStationCode() {
		return stationCode;
	}



	public void setStationCode(StationCode stationCode) {
		this.stationCode = stationCode;
	}


}
