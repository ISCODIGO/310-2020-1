package arbol.general;

public class Main {
    public static void main(String[] args) {
        Arbol<String> tree = new Arbol<>();
        Nodo<String> nodoA = new Nodo<>("A");
        Nodo<String> nodoB = new Nodo<>("B");
        Nodo<String> nodoC = new Nodo<>("C");
        Nodo<String> nodoD = new Nodo<>("D");
        Nodo<String> nodoE = new Nodo<>("E");
        Nodo<String> nodoF = new Nodo<>("F");
        Nodo<String> nodoG = new Nodo<>("G");
        Nodo<String> nodoH = new Nodo<>("H");
        Nodo<String> nodoI = new Nodo<>("I");
        Nodo<String> nodoJ = new Nodo<>("J");
        Nodo<String> nodoK = new Nodo<>("K");
        
        tree.raiz = nodoA;
        tree.raiz.hijo = nodoB;
        tree.raiz.hijo.hijo = nodoF;
        tree.raiz.hijo.hermano = nodoC;
        nodoC.hermano = nodoD;
        nodoD.hermano = nodoE;
        nodoD.hijo = nodoH;
        nodoE.hijo = nodoI;
        nodoI.hermano = nodoJ;
        nodoJ.hijo = nodoK;
        nodoF.hermano = nodoG;
        
        // Probar si esto funciona... Imprimir H
        System.out.println(tree.raiz.hijo.hermano.hermano.hijo);
        
        // Son 11 nodos
        System.out.println(tree.getTamaño());
    }
}
