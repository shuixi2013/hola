/*
 * Copyright 2015 Todd Kulesza <todd@dropline.net>.
 *
 * This file is part of Hola.
 *
 * Hola is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Hola is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Hola.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.straylightlabs.hola;

import net.straylightlabs.hola.dns.*;
import net.straylightlabs.hola.sd.InstanceTest;
import net.straylightlabs.hola.sd.QueryTest;
import net.straylightlabs.hola.sd.ServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ARecordTest.class, AaaaRecordTest.class, DomainTest.class, InstanceTest.class,
        PtrRecordTest.class, QuestionTest.class, RecordTest.class, ResponseTest.class, ServiceTest.class,
        SrvRecordTest.class, TxtRecordTest.class, QueryTest.class})
public class TestSuite {
}