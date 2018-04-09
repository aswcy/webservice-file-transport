package com.zyyfw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2018-04-09T16:52:46.702+08:00
 * Generated source version: 2.5.9
 * 
 */
@WebService(targetNamespace = "http://zyyfw.com/", name = "FileWS")
@XmlSeeAlso({ObjectFactory.class})
public interface FileWS {

    @WebMethod
    @RequestWrapper(localName = "download", targetNamespace = "http://zyyfw.com/", className = "com.zyyfw.Download")
    @ResponseWrapper(localName = "downloadResponse", targetNamespace = "http://zyyfw.com/", className = "com.zyyfw.DownloadResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.zyyfw.CxfFileWrapper download();

    @WebMethod
    @RequestWrapper(localName = "upload", targetNamespace = "http://zyyfw.com/", className = "com.zyyfw.Upload")
    @ResponseWrapper(localName = "uploadResponse", targetNamespace = "http://zyyfw.com/", className = "com.zyyfw.UploadResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean upload(
        @WebParam(name = "file", targetNamespace = "")
        com.zyyfw.CxfFileWrapper file
    );
}