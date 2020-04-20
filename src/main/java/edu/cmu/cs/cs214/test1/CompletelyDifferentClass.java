package edu.cmu.cs.cs214.test1;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class CompletelyDifferentClass {
    int first = 0;

    public int getFirst(){
        return first;
    }


    public enum TileSection {
        N{
            @Override
            public TileSection secAbove(){ return S; }
            @Override
            public TileSection secBelow(){ return C; }
            @Override
            public TileSection secLeft(){ return NW; }
            @Override
            public TileSection secRight(){ return NE; }
        },
        E{
            @Override
            public TileSection secAbove(){ return NE; }
            @Override
            public TileSection secBelow(){ return SE; }
            @Override
            public TileSection secLeft(){ return C; }
            @Override
            public TileSection secRight(){ return W; }
        },
        S{
            @Override
            public TileSection secAbove(){ return C; }
            @Override
            public TileSection secBelow(){ return N; }
            @Override
            public TileSection secLeft(){ return SW; }
            @Override
            public TileSection secRight(){ return SE; }
        },
        W{
            @Override
            public TileSection secAbove(){ return NW; }
            @Override
            public TileSection secBelow(){ return SW; }
            @Override
            public TileSection secLeft(){ return E; }
            @Override
            public TileSection secRight(){ return C; }
        },
        C{
            @Override
            public TileSection secAbove(){ return N; }
            @Override
            public TileSection secBelow(){ return S; }
            @Override
            public TileSection secLeft(){ return W; }
            @Override
            public TileSection secRight(){ return E; }
        },
        NE{
            @Override
            public TileSection secAbove(){ return SE; }
            @Override
            public TileSection secBelow(){ return E; }
            @Override
            public TileSection secLeft(){ return N; }
            @Override
            public TileSection secRight(){ return NW; }
        },
        NW{
            @Override
            public TileSection secAbove(){ return SW; }
            @Override
            public TileSection secBelow(){ return W; }
            @Override
            public TileSection secLeft(){ return NE; }
            @Override
            public TileSection secRight(){ return N; }
        },
        SE{
            @Override
            public TileSection secAbove(){ return E; }
            @Override
            public TileSection secBelow(){ return NE; }
            @Override
            public TileSection secLeft(){ return S; }
            @Override
            public TileSection secRight(){ return SW; }
        },
        SW{
            @Override
            public TileSection secAbove(){ return W; }
            @Override
            public TileSection secBelow(){ return NW; }
            @Override
            public TileSection secLeft(){ return SE; }
            @Override
            public TileSection secRight(){ return S; }
        };

        /** copied from textbook Effective Java Item 34 */
        private static final Map<String, TileSection> STRING_TO_ENUM =
                Stream.of(values()).collect(toMap(Object::toString, e -> e));

        /**
         * Returns the TileSection enum value of a string.
         * @param symbol the string
         * @return enum of the string
         */
        public static TileSection fromString(String symbol) {
            return STRING_TO_ENUM.get(symbol);
        }

        //used in graph search
        public abstract TileSection secAbove();
        public abstract TileSection secBelow();
        public abstract TileSection secLeft();
        public abstract TileSection secRight();

    }
}
