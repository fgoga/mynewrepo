package movement;

import core.Coord;
import movement.map.MapNode;

public class TransitStop {

    public MapNode node;
    int timeTo;
    private TransitStop next;
    private TransitStop prev;
    private TransitWay forward;
    private TransitWay backward;

    public TransitStop(MapNode node, int timeTo) {
        this.node = node;
        this.timeTo = timeTo;
    }

    public boolean equals(TransitStop s) {
        if (s == this) {
            return true;
        }
        if (s.node.equals(this.node)) {
            return true;
        }
        return s.node.getLocation().equals(
                this.node.getLocation()
        );

    }

    public TransitStop getNext() {
        return next;
    }

    public TransitStop getPrev() {
        return prev;
    }

    public TransitWay getForward() {
        return forward;
    }

    public TransitWay getBackward() {
        return backward;
    }

    public void setNext(TransitStop next) {
        this.next = next;
    }

    public void setPrev(TransitStop prev) {
        this.prev = prev;
    }

    public void setForward(TransitWay forward) {
        this.forward = forward;
    }

    public void setBackward(TransitWay backward) {
        this.backward = backward;
    }
    
    public int timeTo() {
    	return this.timeTo;
    }
    
    static public TransitStop dummy() {
    	MapNode mn = new MapNode(new Coord(0,0));
    	return new TransitStop(mn, 0);
    }
}
