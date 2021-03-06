/**
 * 
 */
package com.frontend.backend.ARGuide.webParserV3;

import java.util.LinkedList;

/**
 * @author Paul-Reftu
 *
 */
/**
 * Clasa Eveniment retine o linie din tabelul parsat
 *
 */
public class Eveniment{
    /**
     * ora de inceput a evenimentului
     */
    public String oraStart;
    /**
     * ora de final a evenimentului
     */
    public String oraFinal;
    /**
     *numele evenimentului
     */
    public String numeEveniment;
    /**
     * tipul evenimentului curs sau  laborator
     */
    public String tipEveniment;
    /**
     * lista profesorilor
     */
    public LinkedList<String> listaProfesori=new LinkedList<>();
    /**
     *Lista grupelor de studenti
     */

    public LinkedList<String> listaGrupe=new LinkedList<>();


    /*************************************************************
     * functia care returneaza ora de start
     */
    public String getOraStart(){
        return this.oraStart;
    }
    /**
     * functia care returneaza ora de final
     */

    public String getOraFinal(){
        return this.oraFinal;
    }
    /**
     * functia care returneza numele evenimentului
     */

    public String getNumeEveniment(){
        return this.numeEveniment;
    }
    /**
     * functia care returneaza tipul evenimentului
     */
    public String getTipEveniment(){
        return this.tipEveniment;
    }
    /**
     * functia care returneaza lista profesorilor
     */
    public LinkedList<String> getListaProfesori(){
        return this.listaProfesori;
    }
    /**
     * functia care returneaza lista grupelor de studenti
     */
    public LinkedList<String> getListaGrupe(){
        return this.listaGrupe;
    }


    /************************************************************/
    public Eveniment(String oraStart, String oraFinal, String numeEveniment, String tipEveniment, LinkedList<String> listaProfesori, LinkedList<String> listaGrupe){
        this.oraStart=oraStart;
        this.oraFinal=oraFinal;
        this.numeEveniment=numeEveniment;
        this.tipEveniment=tipEveniment;
        this.listaProfesori=listaProfesori;
        this.listaGrupe=listaGrupe;
    }

    public Eveniment(){}


    public String toString(){
        String returnString="Ora de inceput :"+this.oraStart+"\n"+"Ora de terminare :"+this.oraFinal+"\n"+"Numele evenimentului :"+this.numeEveniment+"\n"+"Tipul evenimentului :"+this.tipEveniment+"\n";
        String profesori="";
        String grupe="";
        for(String name:listaProfesori){profesori=profesori+name;}
        for(String grupa:listaGrupe){grupe=grupe+grupa;}
        returnString=returnString+"lista profesori:"+profesori+"\nlista grupelor:"+grupe+"\n\n";
        return returnString;
    }
}
