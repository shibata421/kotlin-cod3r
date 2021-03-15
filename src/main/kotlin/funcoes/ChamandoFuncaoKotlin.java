package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.List;

public class ChamandoFuncaoKotlin {

    public static void main(String[] args) {
        List<String> list = CollectionsKt.arrayListOf("João", "Maria", "Pedro");
        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }
}
