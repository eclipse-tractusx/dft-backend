/*
 * Copyright 2022 CatenaX
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.catenax.dft.entities.database;

import com.catenax.dft.enums.OptionalIdentifierKeyEnum;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "aspect")
@Entity
@Data
public class AspectEntity implements Serializable {

    @Id
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "process_id")
    private String processId;
    @Column(name = "part_instance_id")
    private String partInstanceId;
    @Column(name = "manufacturing_date")
    private String manufacturingDate;
    @Column(name = "manufacturing_country")
    private String manufacturingCountry;
    @Column(name = "manufacturer_part_id")
    private String manufacturerPartId;
    @Column(name = "customer_part_id")
    private String customerPartId;
    @Column(name = "classification")
    private String classification;
    @Column(name = "name_at_manufacturer")
    private String nameAtManufacturer;
    @Column(name = "name_at_customer")
    private String nameAtCustomer;
    @Column(name = "optional_identifier_key")
    private OptionalIdentifierKeyEnum optionalIdentifierKey;
    @Column(name = "optional_identifier_value")
    private String optionalIdentifierValue;
    @Column(name = "shell_id")
    private String shellId;
}
