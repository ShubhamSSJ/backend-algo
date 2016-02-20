# backend-process

This module is contains all the backend implementation sources. 


## Station Node
Any station is represented as a single station node. The node has many properties as does the station. Currently there are only three properties for the station node.

## Station Code: 
The station code is an enumeration and defines the name/code of the station, e.g. PNBE for Patna and so on.

## Station Type:
The station can be divided into multiple types such as "Major", "Minor" and so on. This represents the connectivity of the station.

## Adjacency List:
Each connected station has some other connecting station which is directly next to former station. Such stations are termed adjacent stations. This list contains all such adjacent stations for a given station.
