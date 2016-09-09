/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
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
 */

package org.openo.sdno.ipsecservice.util.operation;

import java.util.Arrays;
import java.util.List;

/**
 * It is used to get vpc information. <br>
 * 
 * @author
 * @version SDNO 0.5 Jun 20, 2016
 */
public class VpcInfo {

    private String vpcId;

    private String routerId;

    private String routerExternalIp;

    private String subnetId;

    /**
     * Constructor<br>
     * 
     * @param vpcInfos The vpc information string, the format is
     *            "cidr|vpcId|osRouterID|routerExternalIP|subnetID"
     * @since SDNO 0.5
     */
    public VpcInfo(String vpcInfos) {
        String[] vpcInfoArray = vpcInfos.split("\\|");
        List<String> vpcList = Arrays.asList(vpcInfoArray);

        this.vpcId = vpcList.get(1);
        this.routerId = vpcList.get(2);
        this.routerExternalIp = vpcList.get(3);
        this.subnetId = vpcList.get(4);
    }

    public String getVpcId() {
        return vpcId;
    }

    public String getRouterId() {
        return routerId;
    }

    public String getRouterExternalIp() {
        return routerExternalIp;
    }

    public String getSubnetId() {
        return subnetId;
    }
}
