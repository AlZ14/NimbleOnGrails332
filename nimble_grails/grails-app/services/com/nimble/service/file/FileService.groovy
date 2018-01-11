/*

aNimble Platform: Application Lifecycle Management Tool
Copyright (C) 2010-2012 ideaStub, LLC

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

*/

package com.nimble.service.file

import javax.servlet.ServletContext
import org.codehaus.groovy.grails.web.context.ServletContextHolder as SCH
import com.nimble.service.NimbleService
import com.nimble.domain.NimbleDomain


class FileService extends NimbleService{

    boolean transactional = true

    def rootDir
    def reader
    def currentFile
    def importFolder = 'WEB-INF/scripts/'

	def attemptSave = { NimbleDomain nb ->
			if( !nb.save(flush:true)) {
			   nb.errors.each {
			        println it
			   }
			}   	
	}

}
