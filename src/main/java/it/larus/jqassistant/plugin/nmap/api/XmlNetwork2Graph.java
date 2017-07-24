/*
 * Copyright (c) 2017 Larus Business Automation
 *
 * This file is part of "JQAssistant Nmap plugin".
 *
 * "JQAssistant Nmap plugin" is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or any later version.
 *
 * "JQAssistant Nmap plugin" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.larus.jqassistant.plugin.nmap.api;

import com.buschmais.jqassistant.core.store.api.Store;
import it.larus.jqassistant.plugin.nmap.domain.FileNetworkDescriptor;
import it.larus.jqassistant.plugin.nmap.xml.Nmaprun;

/**
 * From JAXB tree to node of the graph
 */
public interface XmlNetwork2Graph {

    void setStore(Store store);

    /**
     * Transformation logic
     * @param nmap root element of the nmap output
     * @return
     */
    FileNetworkDescriptor createGraph(Nmaprun nmap);
}
