package projeto_banana;

public class Banana 
{
    //Atributos
    private int id_banana, categoria_banana;
    private double massa_banana, textura_banana, comprimento_banana, diametro_banana, ph_banana;   
     
    
    //Massa banana
    public void setMassa(double massa)
    {
        massa_banana = massa;
    }
    public double getMassa()
    {
        return massa_banana;
    }
    
    //Textura banana
    public void setTextura(double textura)
    {
        textura_banana = textura;
    }
    public double getTextura()
    {
        return textura_banana;
    }
    
    //Comprimento banana
    public void setComprimento(double comprimento)
    {
        comprimento_banana = comprimento;
    }
    public double getComprimento()
    {
        return comprimento_banana;
    }
    
    //Diametro banana
    public void setDiametro(double diametro)
    {
        diametro_banana = diametro;
    }
    public double getDiametro()
    {
        return diametro_banana;
    }
    
    //PH banana
    public void setPh(double ph)
    {
        ph_banana = ph;
    }
    public double getPh()
    {
        return ph_banana;
    }
    
    //Categoria banana
    public void setCategoria(int categoria)
    {
        categoria_banana = categoria;
    }
    public int getCategoria()
    {
        return categoria_banana;
    }
    
    
    //Calcula categoria
    public String calcula_categoria()
    {
        switch (categoria_banana) 
        {
            case 0:
                return "Verde";
                
            case 1:
                return "De vez";
                
            case 2:
                return "Madura";
                
            default:
                return "Passada";
        }
    }
}
