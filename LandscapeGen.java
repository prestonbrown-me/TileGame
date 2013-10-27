package tilelandscape;

import java.awt.Color;
import java.util.Random;

public class LandscapeGen {

    GlobalNums num = new GlobalNums();
    Tile[][] xTile = new Tile[num.tileRow][num.tileCol];
    Random rand = new Random();
    static boolean go = false;

    public LandscapeGen() {


        int xCoord = 0;
        int yCoord = 0;

        int probability = 1;

        for (int i = 0; i < num.tileCol; i++) {
            for (int z = 0; z < num.tileRow; z++) {

                xTile[z][i] = new Tile();

                probability = rand.nextInt(8);

                if (0 <= probability && probability <= 3) {
                    xTile[z][i].properties = 2;
                } else if (probability == 6) {
                    xTile[z][i].properties = 3;
                } else if (probability == 7) {
                    xTile[z][i].properties = 1;
                } else if (probability == 4) {
                    xTile[z][i].properties = 4;
                }

                xTile[z][i].xPos = xCoord;
                xTile[z][i].yPos = yCoord;

                yCoord += num.tileSq;
            }
            yCoord = 0;
            xCoord += num.tileSq;
        }

    }

    public Tile getTile(int row, int col) {
        return xTile[row][col];
    }

    public void fixTiles() {

        int count;

        for (int i = 0; i < num.tileCol; i++) {

            for (int z = 0; z < num.tileRow; z++) {

                count = 0;

                if (z >= 2 && i >= 2 && z < num.tileRow - 2 && i < num.tileCol - 2) {
                    if (xTile[z][i].properties != 2) {

                        if (xTile[z][i].properties == xTile[z + 1][i + 1].properties) {
                            count++;
                        }
                        if (xTile[z - 1][i - 1].properties == xTile[z][i].properties) {
                            count++;
                        }
                        if (xTile[z - 1][i + 1].properties == xTile[z][i].properties) {
                            count++;
                        }
                        if (xTile[z + 1][i - 1].properties == xTile[z][i].properties) {
                            count++;
                        }
                        if (xTile[z][i + 1].properties == xTile[z][i].properties) {
                            count++;
                        }
                        if (xTile[z][i - 1].properties == xTile[z][i].properties) {
                            count++;
                        }
                        if (xTile[z + 1][i].properties == xTile[z][i].properties) {
                            count++;
                        }
                        if (xTile[z - 1][i].properties == xTile[z][i].properties) {
                            count++;
                        }
                    }

                }

                Color water = new Color(0, 75, 255);
                Color grass = new Color(50, 255, 50);
                Color wood = new Color(120, 69, 19);
                Color stone = new Color(140, 140, 140);
                
                if(xTile[z][i].properties == 1){
                    xTile[z][i].locColor = water;
                }
                if(xTile[z][i].properties == 2){
                    xTile[z][i].locColor = grass;
                }
                if(xTile[z][i].properties == 3){
                    xTile[z][i].locColor = stone;
                }
                if(xTile[z][i].properties == 4){
                    xTile[z][i].locColor = wood;
                }

            }
        }

        go = true;

    }
}