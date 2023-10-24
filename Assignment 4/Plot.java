package application;

public class Plot extends Object {
	private int x; 
	private int y;
	private int width;
	private int depth;
	public Plot() {
		this.width = 1;
		this.depth = 1;
		
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	public Plot (Plot otherPlot) {
		this(otherPlot.x, otherPlot.y, otherPlot.width, otherPlot.depth);
	}
	public boolean overlaps(Plot plot) {
        
		int x2 = plot.getX();
		int y2 = plot.getY();
		int depth2 = plot.getDepth();
		int width2 = plot.getWidth();
		boolean overlap = false;
		
		if((x < x2) && (x2 < (x+width))) {
			if(((y < y2) && (y2 < (y+depth))) || ( (y < (y2+depth2)) && ((y2+depth2) < (y+depth)))) {
				overlap = true;
			}
		}
		if((x < (x2+width2)) && ((x2+width2) < (x+width))) {
			if(((y < y2) && (y2 < (y+depth))) || ( (y < (y2+depth2)) && ((y2+depth2) < (y+depth)))) {
				overlap = true;
			}
		}
		
		if((x2 < x) && (x < (x2+width2))) {
			if(((y2 < y) && (y < (y2+depth2))) || ( (y2 < (y+depth)) && ((y+depth) < (y2+depth2)))) {
				overlap = true;
			}
		}
		if((x2 < (x+width)) && ((x+width) < (x2+width2))) {
			if(((y2 < y) && (y < (y2+depth2))) || ( (y2 < (y+depth)) && ((y+depth) < (y2+depth2)))) {
				overlap = true;
			}
		}
		
		if(encompasses(plot)) {
			overlap = true;
		}
		
		return overlap;
    }
	public boolean encompasses(Plot plot) {
		int x2 = plot.getX();
		int y2 = plot.getY();
		int depth2 = plot.getDepth();
		int width2 = plot.getWidth();
		
		if((x <= x2) && (x2 <= (x+width))) {
			if((y <= y2) && (y2 <= (y+depth))) {
				if((x <= (x2+width2)) && ((x2+width2) <= (x+width))) {
					if((y <= (y2+depth2)) && ((y2+depth2) <= (y+depth))) {
						return true;
					}
				}
			}
			
		}
		
		return false;
		
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setDepth (int depth) {
		this.depth = depth;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getWidth() {
		return this.width;
	}
	public int getDepth() {
		return this.depth;
	}
	public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }

}
