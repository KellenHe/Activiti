/*
 * Copyright 2017 Alfresco and/or its affiliates.
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
 *
 */

package org.activiti.services.history;

import org.activiti.services.history.events.ProcessEngineEventEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import static org.activiti.services.history.EventsRelProvider.COLLECTION_RESOURCE_REL;

@RepositoryRestResource(collectionResourceRel = COLLECTION_RESOURCE_REL, path = COLLECTION_RESOURCE_REL)
interface EventStoreRestResource extends PagingAndSortingRepository<ProcessEngineEventEntity, Long> {


}