/*
 * Copyright 2016 ELIXIR EGA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.elixir.ega.ebi.dataedge.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

/**
 *
 * @author asenf
 */
public interface FileService {
    
    public void getFile(Authentication auth, 
                        String file_id,
                        String destinationFormat,
                        String destinationKey,
                        long startCoordinate,
                        long endCoordinate,
                        HttpServletRequest request,
                        HttpServletResponse response);
    
    public void getFileHead(Authentication auth, 
                        String file_id,
                        HttpServletRequest request,
                        HttpServletResponse response);
    
    public Object getFileHeader(Authentication auth, 
                                String file_id,
                                String destinationFormat,
                                String destinationKey);
    
    public void getById(Authentication auth, 
                        String file_id,
                        String accession,
                        String format,
                        String reference,
                        long start,
                        long end, 
                        List<String> fields,
                        List<String> tags,
                        List<String> notags,
                        boolean header,
                        String destinationFormat,
                        String destinationKey,
                        HttpServletRequest request,
                        HttpServletResponse response);

    public void getVCFById(Authentication auth, 
                           String file_id,
                           String accession,
                           String format,
                           String reference,
                           long start,
                           long end, 
                           List<String> fields,
                           List<String> tags,
                           List<String> notags,
                           boolean header,
                           String destinationFormat,
                           String destinationKey,
                           HttpServletRequest request,
                           HttpServletResponse response);
    
    public ResponseEntity getHeadById(Authentication auth, 
                            String file_id,
                            String accession,
                            HttpServletRequest request,
                            HttpServletResponse response);
}
