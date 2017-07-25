package org.parse4s.requests

import org.parse4s.ParseData

class PutRequest(className: String, data: ParseData)
    extends ParseRequest(className = className,
                         method = HTTP_METHOD.PUT,
                         data = data)
