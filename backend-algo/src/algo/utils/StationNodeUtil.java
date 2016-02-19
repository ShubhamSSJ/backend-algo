package algo.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StationNodeUtil {

	//Map to store the StationCode and the Station Node
	static HashMap<StationCode,StationNode> stationGraph = new HashMap<StationCode,StationNode>(); 
	
	/**
	 * Add the Station Node to the graph
	 */
	public static void addStationNode(StationCode code, StationType type, ArrayList<StationCode> adjacencyList)
	{
		stationGraph.put(code, (new StationNode(code,type,adjacencyList)));
	}
	
	/**
	 * Remove the Station Node from the graph
	 */
	public static boolean removeStationNode(StationCode code)
	{
		if(stationGraph.remove(code) != null)
			return true;
		else
			return false;
	}
	
	/**
	 * Get the whole StationNode Graph
	 */
	public static HashMap<StationCode,StationNode> getStationGraph()
	{
		return stationGraph;
	}
	
	/**
	 * Print the whole StationNode Graph
	 */
	public static void printStationGraph()
	{
		Set<StationCode> allStation = stationGraph.keySet();
		for(StationCode code:allStation)
		{
			StationNode station = stationGraph.get(code);
			System.out.println(station.stationCode);
			for(StationCode adjacentCode:station.adjacencyList)
			{
				System.out.print("->"+adjacentCode);
			}
			System.out.println();
		}
	}
}
