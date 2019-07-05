package supply.exige.competitive;

import supply.exige.competitive.utils.Reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DPMG15S2_MMORPG {

    public static void main(String[] args) throws IOException {

        Point pos;
        Reader reader = new Reader();
        Region[] regions = new Region[reader.nextInt()]; // get region count
        int teleportationCount = reader.nextInt(); // get teleportCount
        String visited = "";

        // Store Regions
        for (int i = 0; i < regions.length; i++) {
            int x, y, w, l;
            x = reader.nextInt();
            y = reader.nextInt();
            w = reader.nextInt();
            l = reader.nextInt();
            regions[i] = new Region(x, y, x + w-1, y + l-1);
        }

        // Store Teleports
        for (int i = 0; i < teleportationCount; i++) {
            int x = reader.nextInt();
            int y = reader.nextInt();
            pos = new Point(x, y);
            List<Region> r = getRegionHits(pos, regions, visited);
            StringBuilder builder = new StringBuilder();
            builder.append(visited);
            for (Region reg : r){
                builder.append(reg.toString() + " ");
            }
            visited = builder.toString();
        }

        /*System.out.println(visited);
        System.out.println(Arrays.toString(visited.split("\\s+")));*/
        System.out.println(visited.split("\\s+").length);


        /*SAMPLE
1 2
0 0 100 100
0 0 50 50
60 60
50 50
         */

    }

    public static List<Region> getRegionHits(Point p, Region[] regions, String visited) {
        List<Region> hitRegions = new ArrayList<>();
        for (int i = 0; i < regions.length; i++) { // Check collision with all regions
            Region r = regions[i];
            boolean xCollide = (p.getX() >= r.getStart().getX() && p.getX() <= r.getEnd().getX()); // Check to see if the entities collide on their x intervals
            boolean yCollide = (p.getY() >= r.getStart().getY() && p.getY() <= r.getEnd().getY()); // Check to see if the entities collide on their y intervals
            if (xCollide && yCollide && !visited.contains(r.toString())) {
                hitRegions.add(r);
                //System.out.println("FOUND REGION");
            }
        }
        return hitRegions;
    }
}


class Region {

    private Point start, end;

    public Region(int x, int y, int w, int l) {
        start = new Point(x, y);
        end = new Point(w, l);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}

class Point {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add(Point p) {
        x += p.getX();
        y += p.getY();
    }

    public void add(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}