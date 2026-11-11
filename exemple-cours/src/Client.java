public class Client {
    
    public static void main(String[] args) {
        System.out.println("bonjour le monde");
        
        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;
        
        // Affiche un produit de type A
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeA);
        produit.methodeproduit();
        
        // Affiche un produit de type B
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeB);
        produit.methodeproduit();
        
        // Affiche un produit de type C
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeC);
        produit.methodeproduit();
        
        // Produit inexistant
        String d = "D";
        try {
            produit = fabriqueproduit.createProduit(d);
            produit.methodeproduit();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
