package org.parse4s.requests

import org.parse4s.{ParseData}

class PostRequest(className: String, data: ParseData)
    extends ParseRequest(className = className,
                         method = HTTP_METHOD.POST,
                         data = data)
