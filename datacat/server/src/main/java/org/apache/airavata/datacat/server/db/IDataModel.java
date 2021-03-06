/*
*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*
*/
package org.apache.airavata.datacat.server.db;

import org.apache.airavata.datacat.models.AclDTO;
import org.apache.airavata.datacat.models.OutputMetadataDTO;
import org.apache.airavata.datacat.models.PrimaryQueryParameter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public interface IDataModel {

    public void addMetadata(OutputMetadataDTO outputMetadataDTO) throws Exception;

    public void updateMetadata(OutputMetadataDTO outputMetadataDTO) throws Exception;

    public void deleteFileMetadata(String dataArchiveNode, String filePath, String fileName) throws  Exception;

    public ArrayList<String> getAclList(String id) throws Exception;

    public void updateAclList(AclDTO aclDTO) throws Exception;

    public String getMetadataDocHTMLById(String id) throws Exception;

    public ArrayList<LinkedHashMap<String, Object>> getResultsFromParameters(List<PrimaryQueryParameter> primaryQueryParameters, String username, String[] userRoles, int startRow, int endRow) throws Exception;

    public ArrayList<LinkedHashMap<String, Object>> getResultsFromQueryString(String query, String username, String[] userRoles, int startRow, int endRow) throws Exception;
}
