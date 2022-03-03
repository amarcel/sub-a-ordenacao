package br.cesupa.suba_ordenacao;

public class Ordenacao {

    public static int[] selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int indiceMenor = i;
            for (int indiceSeguinte = i + 1; indiceSeguinte < vetor.length; indiceSeguinte++) {
                if (vetor[indiceSeguinte] < vetor[indiceMenor]) {
                    indiceMenor = indiceSeguinte;
                }
            } // fim do for interno
            int aux = vetor[i];
            vetor[i] = vetor[indiceMenor];
            vetor[indiceMenor] = aux;
        } // fim do for externo
        return vetor;
    } // fim da função selection sort

    public static int[] bubbleSort(int[] vetor) {
        for (int anterior = 0; anterior < vetor.length; anterior++) {
            for (int posterior = anterior + 1; posterior < vetor.length; posterior++) {
                if (vetor[posterior] > vetor[anterior]) {
                    int aux = vetor[posterior];
                    vetor[posterior] = vetor[anterior];
                    vetor[anterior] = aux;
                }
            } // fim do for interno
        } // fim do for externo
        return vetor;
    } // fim do método bubbleSort
}
