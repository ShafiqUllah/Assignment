package lab8;


import java.util.Arrays;

import lab8.MyStringLinkedList.Node;

public class MinSortForNode {
	Node node;
	MinSortForNode(Node firstNode){
		this.node = firstNode;
	}
	public void sort(){
		
		while (node != null && node.next != null) {
			Node nextMinPos = minNode(node);
			swap(node,nextMinPos); 
			node = node.next;
		}
	}
	void swap(Node i, Node j){
		String temp = i.value;
		i.value = j.value;
		j.value = temp;
		
	}
	//find minimum of arr between the indices bottom and top
	public Node minNode(Node startingNode){		
		Node mini = startingNode;
		
		while (startingNode != null ) {
			if(startingNode.value != null && startingNode.next!= null
					&& mini.value.compareTo(startingNode.next.value) > 0) {
				mini = startingNode.next;
			}
			startingNode = startingNode.next;
			
		}
		
		return mini;
		
	}

}