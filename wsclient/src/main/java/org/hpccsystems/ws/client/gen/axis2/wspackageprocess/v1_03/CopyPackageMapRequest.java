/**
 * CopyPackageMapRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03;


/**
 *  CopyPackageMapRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class CopyPackageMapRequest implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess",
            "CopyPackageMapRequest", "ns7");

    /**
     * field for SourcePath
     */
    protected java.lang.String localSourcePath;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSourcePathTracker = false;

    /**
     * field for RemoteUserName
     */
    protected java.lang.String localRemoteUserName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRemoteUserNameTracker = false;

    /**
     * field for RemotePassword
     */
    protected java.lang.String localRemotePassword;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRemotePasswordTracker = false;

    /**
     * field for Target
     */
    protected java.lang.String localTarget;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTargetTracker = false;

    /**
     * field for Process
     */
    protected java.lang.String localProcess;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProcessTracker = false;

    /**
     * field for PMID
     */
    protected java.lang.String localPMID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPMIDTracker = false;

    /**
     * field for Activate
     */
    protected boolean localActivate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActivateTracker = false;

    /**
     * field for DaliIp
     */
    protected java.lang.String localDaliIp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDaliIpTracker = false;

    /**
     * field for GlobalScope
     */
    protected boolean localGlobalScope = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGlobalScopeTracker = false;

    /**
     * field for SourceProcess
     */
    protected java.lang.String localSourceProcess;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSourceProcessTracker = false;

    /**
     * field for PreloadAllPackages
     */
    protected boolean localPreloadAllPackages = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPreloadAllPackagesTracker = false;

    /**
     * field for ReplacePackageMap
     */
    protected boolean localReplacePackageMap = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReplacePackageMapTracker = false;

    /**
     * field for UpdateSuperFiles
     */
    protected boolean localUpdateSuperFiles = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUpdateSuperFilesTracker = false;

    /**
     * field for UpdateCloneFrom
     */
    protected boolean localUpdateCloneFrom = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUpdateCloneFromTracker = false;

    /**
     * field for AppendCluster
     */
    protected boolean localAppendCluster = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "true");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAppendClusterTracker = false;

    public boolean isSourcePathSpecified() {
        return localSourcePathTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSourcePath() {
        return localSourcePath;
    }

    /**
     * Auto generated setter method
     * @param param SourcePath
     */
    public void setSourcePath(java.lang.String param) {
        localSourcePathTracker = param != null;

        this.localSourcePath = param;
    }

    public boolean isRemoteUserNameSpecified() {
        return localRemoteUserNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRemoteUserName() {
        return localRemoteUserName;
    }

    /**
     * Auto generated setter method
     * @param param RemoteUserName
     */
    public void setRemoteUserName(java.lang.String param) {
        localRemoteUserNameTracker = param != null;

        this.localRemoteUserName = param;
    }

    public boolean isRemotePasswordSpecified() {
        return localRemotePasswordTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRemotePassword() {
        return localRemotePassword;
    }

    /**
     * Auto generated setter method
     * @param param RemotePassword
     */
    public void setRemotePassword(java.lang.String param) {
        localRemotePasswordTracker = param != null;

        this.localRemotePassword = param;
    }

    public boolean isTargetSpecified() {
        return localTargetTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTarget() {
        return localTarget;
    }

    /**
     * Auto generated setter method
     * @param param Target
     */
    public void setTarget(java.lang.String param) {
        localTargetTracker = param != null;

        this.localTarget = param;
    }

    public boolean isProcessSpecified() {
        return localProcessTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getProcess() {
        return localProcess;
    }

    /**
     * Auto generated setter method
     * @param param Process
     */
    public void setProcess(java.lang.String param) {
        localProcessTracker = param != null;

        this.localProcess = param;
    }

    public boolean isPMIDSpecified() {
        return localPMIDTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPMID() {
        return localPMID;
    }

    /**
     * Auto generated setter method
     * @param param PMID
     */
    public void setPMID(java.lang.String param) {
        localPMIDTracker = param != null;

        this.localPMID = param;
    }

    public boolean isActivateSpecified() {
        return localActivateTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getActivate() {
        return localActivate;
    }

    /**
     * Auto generated setter method
     * @param param Activate
     */
    public void setActivate(boolean param) {
        // setting primitive attribute tracker to true
        localActivateTracker = true;

        this.localActivate = param;
    }

    public boolean isDaliIpSpecified() {
        return localDaliIpTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDaliIp() {
        return localDaliIp;
    }

    /**
     * Auto generated setter method
     * @param param DaliIp
     */
    public void setDaliIp(java.lang.String param) {
        localDaliIpTracker = param != null;

        this.localDaliIp = param;
    }

    public boolean isGlobalScopeSpecified() {
        return localGlobalScopeTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getGlobalScope() {
        return localGlobalScope;
    }

    /**
     * Auto generated setter method
     * @param param GlobalScope
     */
    public void setGlobalScope(boolean param) {
        // setting primitive attribute tracker to true
        localGlobalScopeTracker = true;

        this.localGlobalScope = param;
    }

    public boolean isSourceProcessSpecified() {
        return localSourceProcessTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSourceProcess() {
        return localSourceProcess;
    }

    /**
     * Auto generated setter method
     * @param param SourceProcess
     */
    public void setSourceProcess(java.lang.String param) {
        localSourceProcessTracker = param != null;

        this.localSourceProcess = param;
    }

    public boolean isPreloadAllPackagesSpecified() {
        return localPreloadAllPackagesTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getPreloadAllPackages() {
        return localPreloadAllPackages;
    }

    /**
     * Auto generated setter method
     * @param param PreloadAllPackages
     */
    public void setPreloadAllPackages(boolean param) {
        // setting primitive attribute tracker to true
        localPreloadAllPackagesTracker = true;

        this.localPreloadAllPackages = param;
    }

    public boolean isReplacePackageMapSpecified() {
        return localReplacePackageMapTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getReplacePackageMap() {
        return localReplacePackageMap;
    }

    /**
     * Auto generated setter method
     * @param param ReplacePackageMap
     */
    public void setReplacePackageMap(boolean param) {
        // setting primitive attribute tracker to true
        localReplacePackageMapTracker = true;

        this.localReplacePackageMap = param;
    }

    public boolean isUpdateSuperFilesSpecified() {
        return localUpdateSuperFilesTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getUpdateSuperFiles() {
        return localUpdateSuperFiles;
    }

    /**
     * Auto generated setter method
     * @param param UpdateSuperFiles
     */
    public void setUpdateSuperFiles(boolean param) {
        // setting primitive attribute tracker to true
        localUpdateSuperFilesTracker = true;

        this.localUpdateSuperFiles = param;
    }

    public boolean isUpdateCloneFromSpecified() {
        return localUpdateCloneFromTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getUpdateCloneFrom() {
        return localUpdateCloneFrom;
    }

    /**
     * Auto generated setter method
     * @param param UpdateCloneFrom
     */
    public void setUpdateCloneFrom(boolean param) {
        // setting primitive attribute tracker to true
        localUpdateCloneFromTracker = true;

        this.localUpdateCloneFrom = param;
    }

    public boolean isAppendClusterSpecified() {
        return localAppendClusterTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getAppendCluster() {
        return localAppendCluster;
    }

    /**
     * Auto generated setter method
     * @param param AppendCluster
     */
    public void setAppendCluster(boolean param) {
        // setting primitive attribute tracker to true
        localAppendClusterTracker = true;

        this.localAppendCluster = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, MY_QNAME));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "urn:hpccsystems:ws:wspackageprocess");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":CopyPackageMapRequest", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "CopyPackageMapRequest", xmlWriter);
            }
        }

        if (localSourcePathTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "SourcePath", xmlWriter);

            if (localSourcePath == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SourcePath cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSourcePath);
            }

            xmlWriter.writeEndElement();
        }

        if (localRemoteUserNameTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "RemoteUserName", xmlWriter);

            if (localRemoteUserName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "RemoteUserName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localRemoteUserName);
            }

            xmlWriter.writeEndElement();
        }

        if (localRemotePasswordTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "RemotePassword", xmlWriter);

            if (localRemotePassword == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "RemotePassword cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localRemotePassword);
            }

            xmlWriter.writeEndElement();
        }

        if (localTargetTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "Target", xmlWriter);

            if (localTarget == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Target cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTarget);
            }

            xmlWriter.writeEndElement();
        }

        if (localProcessTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "Process", xmlWriter);

            if (localProcess == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Process cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localProcess);
            }

            xmlWriter.writeEndElement();
        }

        if (localPMIDTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "PMID", xmlWriter);

            if (localPMID == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PMID cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPMID);
            }

            xmlWriter.writeEndElement();
        }

        if (localActivateTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "Activate", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Activate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localActivate));
            }

            xmlWriter.writeEndElement();
        }

        if (localDaliIpTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "DaliIp", xmlWriter);

            if (localDaliIp == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "DaliIp cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDaliIp);
            }

            xmlWriter.writeEndElement();
        }

        if (localGlobalScopeTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "GlobalScope", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "GlobalScope cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localGlobalScope));
            }

            xmlWriter.writeEndElement();
        }

        if (localSourceProcessTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "SourceProcess", xmlWriter);

            if (localSourceProcess == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SourceProcess cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSourceProcess);
            }

            xmlWriter.writeEndElement();
        }

        if (localPreloadAllPackagesTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "PreloadAllPackages", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PreloadAllPackages cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPreloadAllPackages));
            }

            xmlWriter.writeEndElement();
        }

        if (localReplacePackageMapTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "ReplacePackageMap", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReplacePackageMap cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localReplacePackageMap));
            }

            xmlWriter.writeEndElement();
        }

        if (localUpdateSuperFilesTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "UpdateSuperFiles", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "UpdateSuperFiles cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localUpdateSuperFiles));
            }

            xmlWriter.writeEndElement();
        }

        if (localUpdateCloneFromTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "UpdateCloneFrom", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "UpdateCloneFrom cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localUpdateCloneFrom));
            }

            xmlWriter.writeEndElement();
        }

        if (localAppendClusterTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "AppendCluster", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AppendCluster cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localAppendCluster));
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:wspackageprocess")) {
            return "ns7";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static CopyPackageMapRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            CopyPackageMapRequest object = new CopyPackageMapRequest();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"CopyPackageMapRequest".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (CopyPackageMapRequest) org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement()) {
                        if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "SourcePath").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SourcePath" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSourcePath(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "RemoteUserName").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "RemoteUserName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setRemoteUserName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "RemotePassword").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "RemotePassword" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setRemotePassword(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "Target").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Target" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTarget(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "Process").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Process" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setProcess(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "PMID").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PMID" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPMID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "Activate").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Activate" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setActivate(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "DaliIp").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "DaliIp" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDaliIp(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "GlobalScope").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "GlobalScope" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setGlobalScope(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "SourceProcess").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SourceProcess" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSourceProcess(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "PreloadAllPackages").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PreloadAllPackages" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPreloadAllPackages(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "ReplacePackageMap").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ReplacePackageMap" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setReplacePackageMap(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "UpdateSuperFiles").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "UpdateSuperFiles" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setUpdateSuperFiles(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "UpdateCloneFrom").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "UpdateCloneFrom" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setUpdateCloneFrom(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "AppendCluster").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "AppendCluster" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAppendCluster(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else {
                            // 3 - A start element we are not expecting indicates an invalid parameter was passed
                            throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
