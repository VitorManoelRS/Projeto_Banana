package projeto_banana;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


public class Banco 
{
    private String url_banco;
    private int id_amostra;
    
    //Caminho do banco
    public void setUrl(String url)
    {
        url_banco = url;
    }
    
    //Identificacao da amostra
    public void setId(int id)
    {
        id_amostra = id;
        
    }   
    
    public double massa_bd() throws Exception
    {
        String dataPath = url_banco;
        
        DataSource basedados = new DataSource(dataPath);
        Instances bd = basedados.getDataSet();
        
        return bd.instance(id_amostra).value(0);
    }
    
    public double textura_bd() throws Exception
    {
        String dataPath = url_banco;
        
        DataSource basedados = new DataSource(dataPath);
        Instances bd = basedados.getDataSet();
        
        return bd.instance(id_amostra).value(1);
    }
    
    public double comprimento_bd() throws Exception
    {
        String dataPath = url_banco;
        
        DataSource basedados = new DataSource(dataPath);
        Instances bd = basedados.getDataSet();
        
        return bd.instance(id_amostra).value(2);
    }
    
    public double diametro_bd() throws Exception
    {
        String dataPath = url_banco;
        
        DataSource basedados = new DataSource(dataPath);
        Instances bd = basedados.getDataSet();
        
        return bd.instance(id_amostra).value(3);
    }
    
    public double ph_bd() throws Exception
    {
        String dataPath = url_banco;
        
        DataSource basedados = new DataSource(dataPath);
        Instances bd = basedados.getDataSet();
        
        return bd.instance(id_amostra).value(4);
    }
    
    public double categoria_bd() throws Exception
    {
        String dataPath = url_banco;
        
        DataSource basedados = new DataSource(dataPath);
        Instances bd = basedados.getDataSet();
        
        return bd.instance(id_amostra).value(5);
    }
}
