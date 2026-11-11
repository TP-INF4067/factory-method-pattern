public class Client {
    
    public static void main(String[] args) {
        System.out.println("=== Factory Method Pattern - Exemple Modifié ===\n");
        
        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;
        
        // Affiche un produit de type A
        System.out.println("--- Création ProduitA ---");
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeA);
        produit.methodeproduit();
        System.out.println();
        
        // Affiche un produit de type B
        System.out.println("--- Création ProduitB ---");
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeB);
        produit.methodeproduit();
        System.out.println();
        
        // Affiche un produit de type C
        System.out.println("--- Création ProduitC ---");
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeC);
        produit.methodeproduit();
        System.out.println();
        
        // Affiche un produit de type D (NOUVEAU)
        System.out.println("--- Création ProduitD (NOUVEAU) ---");
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeD);
        produit.methodeproduit();
        System.out.println();
        
        // Produit inexistant
        System.out.println("--- Test avec produit inexistant ---");
        String e = "E";
        try {
            produit = fabriqueproduit.createProduit(e);
            produit.methodeproduit();
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
