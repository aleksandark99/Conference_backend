package com.aleksandar.ConferenceProceedingsManager.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories
public class ElasticSearchConfiguration extends AbstractElasticsearchConfiguration {
    @Value("${indexing.elasticsearch.endpoint}")
    private String endpoint;



    @Override
    @Bean
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration configuration = ClientConfiguration.builder()
                .connectedTo(endpoint)
                .build();

        return RestClients.create(configuration).rest();
    }

    @Bean
    public ElasticsearchOperations elasticsearchOperations() {
        return new ElasticsearchRestTemplate(elasticsearchClient());
    }
}
