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

package org.jboss.jsfunit.stub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.faces.lifecycle.Lifecycle;
import javax.faces.lifecycle.LifecycleFactory;

/**
 * <p>Mock implementation of <code>LifecycleFactory</code>.</p>
 *
 * $Id$
 */

public class LifecycleFactoryStub extends LifecycleFactory {


    // ------------------------------------------------------------ Constructors


    /**
     * <p>Return a default instance.</p>
     */
    public LifecycleFactoryStub() {

        lifecycles = new HashMap();
        lifecycles.put(LifecycleFactory.DEFAULT_LIFECYCLE, new LifecycleStub());

    }


    // ----------------------------------------------------- Mock Object Methods


    // ------------------------------------------------------ Instance Variables


    /**
     * <p>The set of Lifecycle instances registered with us.</p>
     */
    private Map lifecycles = null;


    // ------------------------------------------------ LifecycleFactory Methods


    /** {@inheritDoc} */
    public void addLifecycle(String lifecycleId, Lifecycle lifecycle) {

        lifecycles.put(lifecycleId, lifecycle);

    }


    /** {@inheritDoc} */
    public Lifecycle getLifecycle(String lifecycleId) {

        return (Lifecycle) lifecycles.get(lifecycleId);

    }


    /** {@inheritDoc} */
    public Iterator getLifecycleIds() {

        return lifecycles.keySet().iterator();

    }


}