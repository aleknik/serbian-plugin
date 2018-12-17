/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elasticsearch.plugin.serbianplugin.analyzer.config;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.analysis.AbstractIndexAnalyzerProvider;
import org.elasticsearch.plugin.serbianplugin.analyzer.SerbianAnalyzer;


public class SerbianAnalyzerProvider extends AbstractIndexAnalyzerProvider<SerbianAnalyzer> {

    protected SerbianAnalyzer analyzer = new SerbianAnalyzer();
    public static final String NAME = "serbian_analyzer";

    @Inject
    public SerbianAnalyzerProvider(IndexSettings indexSettings, Environment env, String name, Settings settings) {
        super(indexSettings, name, settings);
    }

    @Override
    public SerbianAnalyzer get() {
        return this.analyzer;
    }
}