package arraylist;

import arraylist.interfaces.IIntList;

public class LottoGenerator {

    private static int max = 41;
    private static int min = 1;

    public static IIntList generateLottoNumbers() {
        IntArrayList lottoNumbers = new IntArrayList();
        for (int i = 0; i < 6; i++){
            lottoNumbers.add((int) Math.random() * (max - min + 1) + min);
        }
        return lottoNumbers;
    }


}
