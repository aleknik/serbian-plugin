/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elasticsearch.plugin.serbianplugin;

import org.apache.lucene.analysis.Analyzer;
import org.elasticsearch.index.analysis.AnalyzerProvider;
import org.elasticsearch.indices.analysis.AnalysisModule;
import org.elasticsearch.plugin.serbianplugin.analyzer.config.SerbianAnalyzerProvider;
import org.elasticsearch.plugins.AnalysisPlugin;
import org.elasticsearch.plugins.Plugin;

import java.util.Collections;
import java.util.Map;

/**
 * @author Milan Deket
 */
public class SerbianPlugin extends Plugin implements AnalysisPlugin {

    @Override
    public Map<String, AnalysisModule.AnalysisProvider<AnalyzerProvider<? extends Analyzer>>> getAnalyzers() {
        return Collections.singletonMap("serbian", SerbianAnalyzerProvider::new);
    }
}
