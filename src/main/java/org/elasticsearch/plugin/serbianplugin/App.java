package org.elasticsearch.plugin.serbianplugin;

import org.elasticsearch.plugin.serbianplugin.analyzer.SerbianStemmer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final SerbianStemmer serbianStemmer = new SerbianStemmer();
        serbianStemmer.setCurrent("najjaci");
        serbianStemmer.stem();
        System.out.println(serbianStemmer.getCurrent());
    }
}
