package array;

public class Number_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int temp = n;

        if(n == 0){
            return true;
        }

        if(flowerbed.length == 1){
            return flowerbed[0] == 0;
        }

        if(flowerbed.length == 0){
            return false;
        }

        for (int i = 0; i < flowerbed.length; i++) {

            if(i == flowerbed.length-1){
                if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
                    flowerbed[i] = 1;
                    temp--;
                }

                break;
            }

            if(i == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                temp--;
                continue;
            }

            if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                flowerbed[i] = 1;
                temp--;
            }
        }

        return temp <= 0;
    }
}
