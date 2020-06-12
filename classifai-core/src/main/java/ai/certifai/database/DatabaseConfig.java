/*
 * Copyright (c) 2020 CertifAI
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package ai.certifai.database;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public class DatabaseConfig
{
    public final static String DB_ROOT_PATH = System.getProperty("user.home") + "/.data";
    public final static String PORTFOLIO_DB = DB_ROOT_PATH + "/" +  "portfolio/portfoliodb";
    public final static String PROJECT_DB = DB_ROOT_PATH + "/" + "project/projectdb";

    public static String getDatabaseRootPath()
    {
        return DB_ROOT_PATH;
    }

}