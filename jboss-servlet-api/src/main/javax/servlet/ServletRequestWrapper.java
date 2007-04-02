/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2007, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package javax.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * Provides a convenient implementation of the ServletRequest interface that can
 * be subclassed by developers wishing to adapt the request to a Servlet. This
 * class implements the Wrapper or Decorator pattern. Methods default to calling
 * through to the wrapped request object.
 * 
 * @since v 2.3
 * @see javax.servlet.ServletRequest
 */

public class ServletRequestWrapper implements ServletRequest
{
   private ServletRequest request;

   /**
    * Creates a ServletRequest adaptor wrapping the given request object.
    * 
    * @throws java.lang.IllegalArgumentException
    *            if the request is null
    */

   public ServletRequestWrapper(ServletRequest request)
   {
      if (request == null)
      {
         throw new IllegalArgumentException("Request cannot be null");
      }
      this.request = request;
   }

   /**
    * Return the wrapped request object.
    */
   public ServletRequest getRequest()
   {
      return this.request;
   }

   /**
    * Sets the request object being wrapped.
    * 
    * @throws java.lang.IllegalArgumentException
    *            if the request is null.
    */

   public void setRequest(ServletRequest request)
   {
      if (request == null)
      {
         throw new IllegalArgumentException("Request cannot be null");
      }
      this.request = request;
   }

   /**
    * The default behavior of this method is to call getAttribute(String name)
    * on the wrapped request object.
    */

   public Object getAttribute(String name)
   {
      return this.request.getAttribute(name);
   }

   /**
    * The default behavior of this method is to return getAttributeNames() on
    * the wrapped request object.
    */

   public Enumeration getAttributeNames()
   {
      return this.request.getAttributeNames();
   }

   /**
    * The default behavior of this method is to return getCharacterEncoding() on
    * the wrapped request object.
    */

   public String getCharacterEncoding()
   {
      return this.request.getCharacterEncoding();
   }

   /**
    * The default behavior of this method is to set the character encoding on
    * the wrapped request object.
    */

   public void setCharacterEncoding(String enc) throws java.io.UnsupportedEncodingException
   {
      this.request.setCharacterEncoding(enc);
   }

   /**
    * The default behavior of this method is to return getContentLength() on the
    * wrapped request object.
    */

   public int getContentLength()
   {
      return this.request.getContentLength();
   }

   /**
    * The default behavior of this method is to return getContentType() on the
    * wrapped request object.
    */
   public String getContentType()
   {
      return this.request.getContentType();
   }

   /**
    * The default behavior of this method is to return getInputStream() on the
    * wrapped request object.
    */

   public ServletInputStream getInputStream() throws IOException
   {
      return this.request.getInputStream();
   }

   /**
    * The default behavior of this method is to return getParameter(String name)
    * on the wrapped request object.
    */

   public String getParameter(String name)
   {
      return this.request.getParameter(name);
   }

   /**
    * The default behavior of this method is to return getParameterMap() on the
    * wrapped request object.
    */
   public Map getParameterMap()
   {
      return this.request.getParameterMap();
   }

   /**
    * The default behavior of this method is to return getParameterNames() on
    * the wrapped request object.
    */

   public Enumeration getParameterNames()
   {
      return this.request.getParameterNames();
   }

   /**
    * The default behavior of this method is to return getParameterValues(String
    * name) on the wrapped request object.
    */
   public String[] getParameterValues(String name)
   {
      return this.request.getParameterValues(name);
   }

   /**
    * The default behavior of this method is to return getProtocol() on the
    * wrapped request object.
    */

   public String getProtocol()
   {
      return this.request.getProtocol();
   }

   /**
    * The default behavior of this method is to return getScheme() on the
    * wrapped request object.
    */

   public String getScheme()
   {
      return this.request.getScheme();
   }

   /**
    * The default behavior of this method is to return getServerName() on the
    * wrapped request object.
    */
   public String getServerName()
   {
      return this.request.getServerName();
   }

   /**
    * The default behavior of this method is to return getServerPort() on the
    * wrapped request object.
    */

   public int getServerPort()
   {
      return this.request.getServerPort();
   }

   /**
    * The default behavior of this method is to return getReader() on the
    * wrapped request object.
    */

   public BufferedReader getReader() throws IOException
   {
      return this.request.getReader();
   }

   /**
    * The default behavior of this method is to return getRemoteAddr() on the
    * wrapped request object.
    */

   public String getRemoteAddr()
   {
      return this.request.getRemoteAddr();
   }

   /**
    * The default behavior of this method is to return getRemoteHost() on the
    * wrapped request object.
    */

   public String getRemoteHost()
   {
      return this.request.getRemoteHost();
   }

   /**
    * The default behavior of this method is to return setAttribute(String name,
    * Object o) on the wrapped request object.
    */

   public void setAttribute(String name, Object o)
   {
      this.request.setAttribute(name, o);
   }

   /**
    * The default behavior of this method is to call removeAttribute(String
    * name) on the wrapped request object.
    */
   public void removeAttribute(String name)
   {
      this.request.removeAttribute(name);
   }

   /**
    * The default behavior of this method is to return getLocale() on the
    * wrapped request object.
    */

   public Locale getLocale()
   {
      return this.request.getLocale();
   }

   /**
    * The default behavior of this method is to return getLocales() on the
    * wrapped request object.
    */

   public Enumeration getLocales()
   {
      return this.request.getLocales();
   }

   /**
    * The default behavior of this method is to return isSecure() on the wrapped
    * request object.
    */

   public boolean isSecure()
   {
      return this.request.isSecure();
   }

   /**
    * The default behavior of this method is to return
    * getRequestDispatcher(String path) on the wrapped request object.
    */

   public RequestDispatcher getRequestDispatcher(String path)
   {
      return this.request.getRequestDispatcher(path);
   }

   /**
    * The default behavior of this method is to return getRealPath(String path)
    * on the wrapped request object.
    * 
    * @deprecated As of Version 2.1 of the Java Servlet API, use
    *             {@link ServletContext#getRealPath} instead.
    */
   @Deprecated
   public String getRealPath(String path)
   {
      return this.request.getRealPath(path);
   }

   /**
    * The default behavior of this method is to return getRemotePort() on the
    * wrapped request object.
    * 
    * @since 2.4
    */
   public int getRemotePort()
   {
      return this.request.getRemotePort();
   }

   /**
    * The default behavior of this method is to return getLocalName() on the
    * wrapped request object.
    * 
    * @since 2.4
    */
   public String getLocalName()
   {
      return this.request.getLocalName();
   }

   /**
    * The default behavior of this method is to return getLocalAddr() on the
    * wrapped request object.
    * 
    * @since 2.4
    */
   public String getLocalAddr()
   {
      return this.request.getLocalAddr();
   }

   /**
    * The default behavior of this method is to return getLocalPort() on the
    * wrapped request object.
    * 
    * @since 2.4
    */
   public int getLocalPort()
   {
      return this.request.getLocalPort();
   }

}
