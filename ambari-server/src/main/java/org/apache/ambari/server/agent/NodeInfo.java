/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.server.agent;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Data model for Ambari Agent to send hardware profile to Ambari Server.
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
public class NodeInfo {
  @XmlElement
  private String architecture;
  @XmlElement
  private String domain;
  @XmlElement
  private String fqdn;
  @XmlElement
  private String hardwareisa;
  @XmlElement
  private String hardwaremodel;
  @XmlElement
  private String hostname;
  @XmlElement
  private String id;
  @XmlElement
  private String interfaces;
  @XmlElement
  private String ipaddress;
  @XmlElement
  private boolean is_virtual;
  @XmlElement
  private String kernel;
  @XmlElement
  private String kernelmajversion;
  @XmlElement
  private String kernelrelease;
  @XmlElement
  private String kernelversion;
  @XmlElement
  private String macaddress;
  @XmlElement
  private long memoryfree;
  @XmlElement
  private long memorysize;
  @XmlElement
  private List<DiskInfo> mounts = new ArrayList<DiskInfo>();
  @XmlElement
  private long memorytotal;
  @XmlElement
  private String netmask;
  @XmlElement
  private String operatingsystem;
  @XmlElement
  private String operatingsystemrelease;
  @XmlElement
  private String osfamily;
  @XmlElement
  private int physicalprocessorcount;
  @XmlElement
  private int processorcount;
  @XmlElement
  private boolean selinux;
  @XmlElement
  private String swapfree;
  @XmlElement
  private String swapsize;
  @XmlElement
  private String timezone;
  @XmlElement
  private String uptime;
  @XmlElement
  private long uptime_days;
  @XmlElement
  private long uptime_hours;   

  public String getArchitecture() {
    return this.architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public String getDomain() {
    return this.domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public String getFQDN() {
    return this.fqdn;
  }

  public void setFQDN(String fqdn) {
    this.fqdn = fqdn;
  }

  public String getHardwareIsa() {
    return hardwareisa;
  }

  public void setHardwareIsa(String hardwareisa) {
    this.hardwareisa = hardwareisa;
  }

  public String getHardwareModel() {
    return this.hardwaremodel;
  }

  public void setHardwareModel(String hardwaremodel) {
    this.hardwaremodel = hardwaremodel;
  }

  public String getHostName() {
    return this.hostname;
  }

  public void setHostName(String hostname) {
    this.hostname = hostname;
  }

  public String getAgentUserId() {
    return id;
  }

  public void setAgentUserId(String id) {
    this.id = id;
  }

  public String getInterfaces() {
    return this.interfaces;
  }

  public void setInterfaces(String interfaces) {
    this.interfaces = interfaces;
  }

  public String getIPAddress() {
    return this.ipaddress;
  }

  public void setIPAddress(String ipaddress) {
    this.ipaddress = ipaddress;
  }

  public boolean isVirtual() {
    return this.is_virtual;
  }

  public void setVirtual(boolean is_virtual) {
    this.is_virtual = is_virtual;
  }

  public String getKernel() {
    return this.kernel;
  }

  public void setKernel(String kernel) {
    this.kernel = kernel;
  }

  public String getKernelMajVersion() {
    return this.kernelmajversion;
  }

  public void setKernelMajVersion(String kernelmajversion) {
    this.kernelmajversion = kernelmajversion;
  }

  public String getKernelRelease() {
    return this.kernelrelease;
  }

  public void setKernelRelease(String kernelrelease) {
    this.kernelrelease = kernelrelease;
  }

  public String getKernelVersion() {
    return this.kernelversion;
  }

  public void setKernelVersion(String kernelversion) {
    this.kernelversion = kernelversion;
  }

  public String getMacAddress() {
    return this.macaddress;
  }

  public void setMacAddress(String macaddress) {
    this.macaddress = macaddress;
  }

  public long getFreeMemory() {
    return this.memoryfree;
  }

  public void setFreeMemory(long memoryfree) {
    this.memoryfree = memoryfree;
  }

  public long getMemorySize() {
    return this.memorysize;
  }

  public void setMemorySize(long memorysize) {
    this.memorysize = memorysize;
  }

  public List<DiskInfo> getMounts() {
    return this.mounts;
  }

  public void setMounts(List<DiskInfo> mounts) {
    this.mounts = mounts;
  }

  public long getMemoryTotal() {
    return this.memorytotal;
  }

  public void setMemoryTotal(long memorytotal) {
    this.memorytotal = memorytotal;
  }

  public String getNetMask() {
    return this.netmask;
  }

  public void setNetMask(String netmask) {
    this.netmask = netmask;
  }

  public String getOS() {
    return this.operatingsystem;
  }

  public void setOS(String operatingsystem) {
    this.operatingsystem = operatingsystem;
  }

  public String getOSRelease() {
    return this.operatingsystemrelease;
  }

  public void setOSRelease(String operatingsystemrelease) {
    this.operatingsystemrelease = operatingsystemrelease;
  }

  public String getOSFamily() {
    return this.osfamily;
  }

  public void setOSFamily(String osfamily) {
    this.osfamily = osfamily;
  }

  public int getPhysicalProcessorCount() {
    return this.physicalprocessorcount;
  }

  public void setPhysicalProcessorCount(int physicalprocessorcount) {
    this.physicalprocessorcount = physicalprocessorcount;
  }

  public int getProcessorCount() {
    return this.processorcount;
  }

  public void setProcessorCount(int processorcount) {
    this.processorcount = processorcount;
  }

  public boolean getSeLinux() {
    return selinux;
  }

  public void setSeLinux(boolean selinux) {
    this.selinux = selinux;
  }

  public String getSwapFree() {
    return this.swapfree;
  }

  public void setSwapFree(String swapfree) {
    this.swapfree = swapfree;
  }

  public String getSwapSize() {
    return swapsize;
  }

  public void setSwapSize(String swapsize) {
    this.swapsize = swapsize;
  }

  public String getTimeZone() { 
    return this.timezone;
  }

  public void setTimeZone(String timezone) {
    this.timezone = timezone;
  }

  public String getUptime() {
    return this.uptime;
  }

  public void setUpTime(String uptime) {
    this.uptime = uptime;
  }

  public long getUptimeHours() {
    return this.uptime_hours;
  }

  public void setUpTimeHours(long uptime_hours) {
    this.uptime_hours = uptime_hours;
  }

  public long getUpTimeDays() {
    return this.uptime_days;
  }

  public void setUpTimeDays(long uptime_days) {
    this.uptime_days = uptime_days;
  }

  private String getDiskString() {
    String ret = "";
    for (DiskInfo diskInfo : mounts) {
      ret = ret + "(" + diskInfo.toString() + ")";
    }
    return ret;
  }
  
  public String toString() {
    return "[memory=" + this.memorytotal + "," +
        "uptime_hours=" + this.uptime_hours + "," +
        "operatingsystem=" + this.operatingsystem + "," +
        "mounts=" + getDiskString() + "]\n";
  }
}