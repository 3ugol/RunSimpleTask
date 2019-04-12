import java.util.*;

public class PokerHand
{
    public enum Result { TIE, WIN, LOSS } //

    PokerHand(String hand) {
        this.
//        this.comp = comp;
    }

    public Result compareWith(PokerHand hand) {
        PokerHand gamer = new PokerHand("KS 2H 5C JD TD");


//        if (gamer > compSum) return Result.WIN;
//        else if (gamerSum < compSum) return Result.LOSS;
        return Result.TIE;
    }
}


/*

SHDC - the suit
2,3,4,5,6,7,8,9,T,J,Q,K,A

прочесть и оценить строку
вес комбинации + вес масти

сортировка
поиск флеша -> обычный или стрит
поиск пары



	1	1				16
	13	13				40
	2	2	1	1		49
	13	13	12	12		93
	1	1	1			94
	13	13	13			130
	1	2	3	4	5	131
	9	10	11	12	13	171
Flush	6	5	4	2	1	172
Flush	13	6	5	3	2	179
Full house	1	1	1	2	2	180
Full house	13	13	13	12	12	236
Four of a kind 	1	1	1	1		237
	13	13	13	13		285
Straight flush	1	2	3	4	5	297
	9	10	11	12	13	337




*/
