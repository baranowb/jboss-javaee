/*
* JBoss, Home of Professional Open Source
* Copyright 2005, JBoss Inc., and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
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
package javax.xml.stream;

/**
 * This interface declares the constants used in this API. Numbers in the range
 * 0 to 256 are reserved for the specification, user defined events must use
 * event codes outside that range.
 *
 * @author Jason T. Greene
 * @version $Id$
 */
public interface XMLStreamConstants
{
   /**
    * Indicates an event is a start element
    *
    * @see javax.xml.stream.events.StartElement
    */
   public static final int START_ELEMENT = 1;

   /**
    * Indicates an event is an end element
    *
    * @see javax.xml.stream.events.EndElement
    */
   public static final int END_ELEMENT = 2;

   /**
    * Indicates an event is a processing instruction
    *
    * @see javax.xml.stream.events.ProcessingInstruction
    */
   public static final int PROCESSING_INSTRUCTION = 3;

   /**
    * Indicates an event is characters
    *
    * @see javax.xml.stream.events.Characters
    */
   public static final int CHARACTERS = 4;

   /**
    * Indicates an event is a comment
    *
    * @see javax.xml.stream.events.Comment
    */
   public static final int COMMENT = 5;

   /**
    * The characters are white space (see [XML], 2.10 "White Space Handling").
    * Events are only reported as SPACE if they are ignorable white space.
    * Otherwise they are reported as CHARACTERS.
    *
    * @see javax.xml.stream.events.Characters
    */
   public static final int SPACE = 6;

   /**
    * Indicates an event is a start document
    *
    * @see javax.xml.stream.events.StartDocument
    */
   public static final int START_DOCUMENT = 7;

   /**
    * Indicates an event is an end document
    *
    * @see javax.xml.stream.events.EndDocument
    */
   public static final int END_DOCUMENT = 8;

   /**
    * Indicates an event is an entity reference
    *
    * @see javax.xml.stream.events.EntityReference
    */
   public static final int ENTITY_REFERENCE = 9;

   /**
    * Indicates an event is an attribute
    *
    * @see javax.xml.stream.events.Attribute
    */
   public static final int ATTRIBUTE = 10;

   /**
    * Indicates an event is a DTD
    *
    * @see javax.xml.stream.events.DTD
    */
   public static final int DTD = 11;

   /**
    * Indicates an event is a CDATA section
    *
    * @see javax.xml.stream.events.Characters
    */
   public static final int CDATA = 12;

   /**
    * Indicates the event is a namespace declaration
    *
    * @see javax.xml.stream.events.Namespace
    */
   public static final int NAMESPACE = 13;

   /**
    * Indicates a Notation
    *
    * @see javax.xml.stream.events.NotationDeclaration
    */
   public static final int NOTATION_DECLARATION = 14;

   /**
    * Indicates a Entity Declaration
    *
    * @see javax.xml.stream.events.NotationDeclaration
    */
   public static final int ENTITY_DECLARATION = 15;
}