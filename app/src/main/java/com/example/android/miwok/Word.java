package com.example.android.miwok;

/**
 * Created by adil on 1/14/2017.
 */
public class Word {
   private String defaultTranslation;
    private String hydTranslation;
    private int image=has;
    private String colour=has1;
    private int locate=has;
    private static final int has=-1;
    private static final String has1="hell";
    private String longitude;
    private String latitude;


   public Word(String D,String M)
   {
       defaultTranslation=D;
       hydTranslation=M;
   }


    public Word(String D,String M,int res)
    {defaultTranslation=D;
        hydTranslation=M;
        image=res;}

    public Word(String D,String M,String res1)
    {defaultTranslation=D;
        hydTranslation=M;
        colour=res1;}

    public Word(String D,String M,int res,String res1)
    {defaultTranslation=D;
        hydTranslation=M;
        image=res;
        colour=res1;}

    public Word(String D,String M,String res1,int located,String latitude,String longitude)
    {defaultTranslation=D;
        hydTranslation=M;

        colour=res1;

        locate=located;

        this.latitude=latitude;
        this.longitude=longitude;
    }

    public String getdefaultTranslation(){
        return defaultTranslation;
    }

    public String getHydTranslation()
    {
        return hydTranslation;
    }

    public int getRes_id(){return   image;}

    public String getRes_id1(){return colour;}

    public int getLocate(){return  locate;}

    public String getLatitue()
    {return latitude;}

    public String getLongitude()
    {return  longitude;}



    public boolean ithasimage()
    {return image!=has;}

    public boolean ithascolor(){if(colour.equals(has1))
        return false;
        else
        return true;}


    public  boolean ithaslocation(){
        return locate!=has;

    }

}
