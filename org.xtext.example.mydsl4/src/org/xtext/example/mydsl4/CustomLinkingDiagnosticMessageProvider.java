package org.xtext.example.mydsl4;

import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;

public class CustomLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider {
	 @Override
	 public DiagnosticMessage getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {
		 DiagnosticMessage diagnosticMessage = super.getUnresolvedProxyMessage(context);
	        return new DiagnosticMessage(diagnosticMessage.getMessage(),
	                Severity.WARNING,
	                diagnosticMessage.getIssueCode(),
	                diagnosticMessage.getIssueData());
	 }

}
