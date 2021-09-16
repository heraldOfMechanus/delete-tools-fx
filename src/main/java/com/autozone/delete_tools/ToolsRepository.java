package com.autozone.delete_tools;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class ToolsRepository {

    private final DynamoDBMapper dbReader;

    public ToolsRepository() { this.dbReader = new DynamoDBMapper(AmazonDynamoDBClientBuilder.defaultClient()); }

    public void deleteToolById(Tool tool) { dbReader.delete(tool); }
}
