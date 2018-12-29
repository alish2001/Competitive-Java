package supply.exige.competitive;

import supply.exige.competitive.utils.Reader;

import java.io.IOException;

public class DMOPC14C1P2_Tiles {

    public static void main(String[] args) throws IOException {
        Reader r = new Reader();

        int length = r.nextInt();
        int width = r.nextInt();
        int tileSide = r.nextInt();

        int maxTilesHoriz = (int) Math.floor(length / tileSide);
        int maxTilesVert = (int) Math.floor(width / tileSide);
        int maxTiles = maxTilesHoriz * maxTilesVert;
        System.out.println(maxTiles);
    }
}