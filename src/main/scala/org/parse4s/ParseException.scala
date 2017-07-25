package org.parse4s

/**
  * The error codes are the same at published on [[http://docs.parseplatform.org/rest/guide/#error-codes]]
  */
object ParseException {
  def UserInvalidLoginParams = new ParseException(101, "Invalid login parameters. Check error message for more details.")

  def ObjectNotFound = new ParseException(101, "The specified object or session doesn’t exist or could not be found. Can also indicate that you do not have the necessary permissions to read or write this object. Check error message for more details.")

  def InvalidQuery = new ParseException(102, "There is a problem with the parameters used to construct this query. This could be an invalid field name or an invalid field type for a specific constraint. Check error message for more details.")

  def InvalidClassName = new ParseException(103, "Missing or invalid classname. Classnames are case-sensitive. They must start with a letter, and a-zA-Z0-9_ are the only valid characters.")

  def MissingObjectId = new ParseException(104, "An unspecified object id.")

  def InvalidFieldName = new ParseException(105, "An invalid field name. Keys are case-sensitive. They must start with a letter, and a-zA-Z0-9_ are the only valid characters. Some field names may be reserved. Check error message for more details.")

  def InvalidPointer = new ParseException(106, "A malformed pointer was used. You would typically only see this if you have modified a client SDK.")

  def InvalidJSON = new ParseException(107, "Badly formed JSON was received upstream. This either indicates you have done something unusual with modifying how things encode to JSON, or the network is failing badly. Can also indicate an invalid utf-8 string or use of multiple form encoded values. Check error message for more details.")

  def CommandUnavailable = new ParseException(108, "The feature you tried to access is only available internally for testing purposes.")

  def NotInitialized = new ParseException(109, "You must call Parse.initialize before using the Parse library. Check the Quick Start guide for your platform.")

  def ObjectTooLarge = new ParseException(116, "The object is too large. Parse Objects have a max size of 128 kilobytes.")

  def ExceededConfigParamsError = new ParseException(116, "You have reached the limit of 100 config parameters.")

  def InvalidLimitError = new ParseException(117, "An invalid value was set for the limit. Check error message for more details.")

  def InvalidSkipError = new ParseException(118, "An invalid value was set for skip. Check error message for more details.")

  def OperationForbidden = new ParseException(119, "The operation isn’t allowed for clients due to class-level permissions. Check error message for more details.")

  def CacheMiss = new ParseException(120, "The result was not found in the cache.")

  def InvalidNestedKey = new ParseException(121, "An invalid key was used in a nested JSONObject. Check error message for more details.")

  def InvalidACL = new ParseException(123, "An invalid ACL was provided.")

  def InvalidEmailAddress = new ParseException(125, "The email address was invalid.")

  def DuplicateValue = new ParseException(137, "Unique field was given a value that is already taken.")

  def InvalidRoleName = new ParseException(139, "Role’s name is invalid.")

  def ReservedValue = new ParseException(139, "Field value is reserved.")

  def ExceededCollectionQuota = new ParseException(140, "You have reached the quota on the number of classes in your app. Please delete some classes if you need to add a new class.")

  def ScriptFailed = new ParseException(141, "Cloud Code script failed. Usually points to a JavaScript error. Check error message for more details.")

  def FunctionNotFound = new ParseException(141, "Cloud function not found. Check that the specified Cloud function is present in your Cloud Code script and has been deployed.")

  def JobNotFound = new ParseException(141, "Background job not found. Check that the specified job is present in your Cloud Code script and has been deployed.")

  def SuccessErrorNotCalled = new ParseException(141, "success/error was not called. A cloud function will return once response.successnew org.parse4s.ParseException() or response.errornew org.parse4s.ParseException() is called. A background job will similarly finish execution once status.successnew org.parse4s.ParseException() or status.errornew org.parse4s.ParseException() is called. If a function or job never reaches either of the success/error methods, this error will be returned. This may happen when a function does not handle an error response correctly, preventing code execution from reaching the successnew org.parse4s.ParseException() method call.")

  def MultupleSuccessErrorCalls = new ParseException(141, "Can’t call success/error multiple times. A cloud function will return once response.successnew org.parse4s.ParseException() or response.errornew org.parse4s.ParseException() is called. A background job will similarly finish execution once status.successnew org.parse4s.ParseException() or status.errornew org.parse4s.ParseException() is called. If a function or job calls successnew org.parse4s.ParseException() and/or errornew org.parse4s.ParseException() more than once in a single execution path, this error will be returned.")

  def ValidationFailed = new ParseException(142, "Cloud Code validation failed.")

  def WebhookError = new ParseException(143, "Webhook error.")

  def InvalidImageData = new ParseException(150, "Invalid image data.")

  def UnsavedFileError = new ParseException(151, "An unsaved file.")

  def InvalidPushTimeError = new ParseException(152, "An invalid push time was specified.")

  def HostingError = new ParseException(158, "Hosting error.")

  def InvalidEventName = new ParseException(160, "The provided analytics event name is invalid.")

  def ClassNotEmpty = new ParseException(255, "Class is not empty and cannot be dropped.")

  def AppNameInvalid = new ParseException(256, "App name is invalid.")

  def MissingAPIKeyError = new ParseException(902, "The request is missing an API key.")

  def InvalidAPIKeyError = new ParseException(903, "The request is using an invalid API key.")


  def IncorrectType = new ParseException(111, "A field was set to an inconsistent type. Check error message for more details.")

  def InvalidChannelName = new ParseException(112, "Invalid channel name. A channel name is either an empty string new org.parse4s.ParseException(the broadcast channel) or contains only a-zA-Z0-9_ characters and starts with a letter.")

  def InvalidSubscriptionType = new ParseException(113, "Bad subscription type. Check error message for more details.")

  def InvalidDeviceToken = new ParseException(114, "The provided device token is invalid.")

  def PushMisconfigured = new ParseException(115, "Push is misconfigured in your app. Check error message for more details.")

  def PushWhereAndChannels = new ParseException(115, "Can’t set channels for a query-targeted push. You can fix this by moving the channels into your push query constraints.")

  def PushWhereAndType = new ParseException(115, "Can’t set device type for a query-targeted push. You can fix this by incorporating the device type constraints into your push query.")

  def PushMissingData = new ParseException(115, "Push is missing a ‘data’ field.")

  def PushMissingChannels = new ParseException(115, "Non-query push is missing a ‘channels’ field. Fix by passing a ‘channels’ or ‘query’ field.")

  def ClientPushDisabled = new ParseException(115, "Client-initiated push is not enabled. Check your Parse app’s push notification settings.")

  def RestPushDisabled = new ParseException(115, "REST-initiated push is not enabled. Check your Parse app’s push notification settings.")

  def ClientPushWithURI = new ParseException(115, "Client-initiated push cannot use the “uri” option.")

  def PushQueryOrPayloadTooLarge = new ParseException(115, "Your push query or data payload is too large. Check error message for more details.")

  def InvalidExpirationError = new ParseException(138, "Invalid expiration value.")

  def MissingPushIdError = new ParseException(156, "A push id is missing. Deprecated.")

  def MissingDeviceTypeError = new ParseException(157, "The device type field is missing. Deprecated.")


  def InvalidFileName = new ParseException(122, "An invalid filename was used for Parse File. A valid file name contains only a-zA-Z0-9_. characters and is between 1 and 128 characters.")

  def MissingContentType = new ParseException(126, "Missing content type.")

  def MissingContentLength = new ParseException(127, "Missing content length.")

  def InvalidContentLength = new ParseException(128, "Invalid content length.")

  def FileTooLarge = new ParseException(129, "File size exceeds maximum allowed.")

  def FileSaveError = new ParseException(130, "Error saving a file.")

  def FileDeleteError = new ParseException(131, "File could not be deleted.")


  def InvalidInstallationIdError = new ParseException(132, "Invalid installation id.")

  def InvalidDeviceTypeError = new ParseException(133, "Invalid device type.")

  def InvalidChannelsArrayError = new ParseException(134, "Invalid channels array value.")

  def MissingRequiredFieldError = new ParseException(135, "	Required field is missing.")

  def ChangedImmutableFieldError = new ParseException(136, "	An immutable field was changed.")


  def ReceiptMissing = new ParseException(143, "Product purchase receipt is missing.")

  def InvalidPurchaseReceipt = new ParseException(144, "Product purchase receipt is invalid.")

  def PaymentDisabled = new ParseException(145, "Payment is disabled on this device.")

  def InvalidProductIdentifier = new ParseException(146, "The product identifier is invalid.")

  def ProductNotFoundInAppStore = new ParseException(147, "The product is not found in the App Store.")

  def InvalidServerResponse = new ParseException(148, "The Apple server response is not valid.")

  def ProductDownloadFilesystemError = new ParseException(149, "The product fails to download due to file system error.")

  def UsernameMissing = new ParseException(200, "The username is missing or empty.")

  def PasswordMissing = new ParseException(201, "	The password is missing or empty.")

  def UsernameTaken = new ParseException(202, "The username has already been taken.")

  def UserEmailTaken = new ParseException(203, "Email has already been used.")

  def UserEmailMissing = new ParseException(204, "The email is missing, and must be specified.")

  def UserWithEmailNotFound = new ParseException(205, "A user with the specified email was not found.")

  def SessionMissing = new ParseException(206, "A user object without a valid session could not be altered.")

  def MustCreateUserThroughSignup = new ParseException(207, "A user can only be created through signup.")

  def AccountAlreadyLinked = new ParseException(208, "An account being linked is already linked to another user.")

  def InvalidSessionToken = new ParseException(209, "The device’s session token is no longer valid. The application should ask the user to log in again.")


  def LinkedIdMissing = new ParseException(250, "A user cannot be linked to an account because that account’s id could not be found.")

  def InvalidLinkedSession = new ParseException(251, "A user with a linked new org.parse4s.ParseException(e.g. Facebook or Twitter) account has an invalid session. Check error message for more details.")

  def InvalidGeneralAuthData = new ParseException(251, "Invalid auth data value used.")

  def BadAnonymousID = new ParseException(251, "Anonymous id is not a valid lowercase UUID.")

  def FacebookBadToken = new ParseException(251, "The supplied Facebook session token is expired or invalid.")

  def FacebookBadID = new ParseException(251, "A user with a linked Facebook account has an invalid session.")

  def FacebookWrongAppID = new ParseException(251, "Unacceptable Facebook application id.")

  def TwitterVerificationFailed = new ParseException(251, "Twitter credential verification failed.")

  def TwitterWrongID = new ParseException(251, "Submitted Twitter id does not match the id associated with the submitted access token.")

  def TwitterWrongScreenName = new ParseException(251, "Submitted Twitter handle does not match the handle associated with the submitted access token.")

  def UnsupportedService = new ParseException(252, "A service being linked new org.parse4s.ParseException(e.g. Facebook or Twitter) is unsupported. Check error message for more details.")

  def UsernameSigninDisabled = new ParseException(252, "Authentication by username and password is not supported for this application. Check your Parse app’s authentication settings.")

  def AnonymousSigninDisabled = new ParseException(252, "Anonymous users are not supported for this application. Check your Parse app’s authentication settings.")

  def FacebookSigninDisabled = new ParseException(252, "Authentication by Facebook is not supported for this application. Check your Parse app’s authentication settings.")

  def TwitterSigninDisabled = new ParseException(252, "Authentication by Twitter is not supported for this application. Check your Parse app’s authentication settings.")

  def InvalidAuthDataError = new ParseException(253, "An invalid authData value was passed. Check error message for more details.")

  def LinkingNotSupportedError = new ParseException(999, "Linking to an external account not supported yet with signup_or_login. Use update instead.")

  def ConnectionFailed = new ParseException(100, "The connection to the Parse servers failed.")

  def AggregateError = new ParseException(600, "There were multiple errors. Aggregate errors have an “errors” property, which is an array of error objects with more detail about each error that occurred.")

  def FileReadError = new ParseException(601, "Unable to read input for a Parse File on the client.")

  def XDomainRequest = new ParseException(602, "A real error code is unavailable because we had to use an XDomainRequest object to allow CORS requests in Internet Explorer, which strips the body from HTTP responses that have a non-2XX status code.")

  def RequestTimeout = new ParseException(124, "The request was slow and timed out. Typically this indicates that the request is too expensive to run. You may see this when a Cloud function did not finish before timing out, or when a Parse.Cloud.httpRequest connection times out.")

  def InefficientQueryError = new ParseException(154, "An inefficient query was rejected by the server. Refer to the Performance Guide and slow query log.")

  def RequestLimitExceeded = new ParseException(155, "	This application has exceeded its request limit new org.parse4s.ParseException(legacy Parse.com apps only).")

  def TemporaryRejectionError = new ParseException(159, "An application’s requests are temporary rejected by the server new org.parse4s.ParseException(legacy Parse.com apps only).")

  def DatabaseNotMigratedError = new ParseException(428, "You should migrate your database as soon as possible new org.parse4s.ParseException(legacy Parse.com apps only).")

  def OtherCause = new ParseException(-1, "An unknown error or an error unrelated to Parse occurred.")

  def InternalServerError = new ParseException(1, "Internal server error. No information available.")

  def ServiceUnavailable = new ParseException(2, "The service is currently unavailable.")

  def ClientDisconnected = new ParseException(4, "Connection failure.")
}

case class ParseException(errorCode: Int, message: String) extends Exception {
  def this(message: String) = this(-1, message)
}