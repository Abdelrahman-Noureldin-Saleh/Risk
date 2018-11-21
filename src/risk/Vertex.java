/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package risk;

/**
 *
 * @author Abd El Rahman
 */
class Vertex{

        private final int name;
        private int numSoldiers;
        private int holder;

        public Vertex(int name) {
            this.name = name;
            this.numSoldiers = 0;
            this.holder = 0;
        }

    public int getNumOfSoldier() {
        return numSoldiers;
    }

    public void setNumOfSoldier(int numOfSoldier) {
        this.numSoldiers = numOfSoldier;
    }

    public int getHolder() {
        return holder;
    }

    public void setHolder(int holder) {
        this.holder = holder;
    }
        
        
        
    }
