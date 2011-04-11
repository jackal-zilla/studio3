package com.aptana.deploy.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;

import com.aptana.deploy.DeployPlugin;

public abstract class AbstractDeployWizard extends Wizard implements IDeployWizard
{

	private static final ImageDescriptor fgDefaultImage = DeployPlugin.imageDescriptorFromPlugin(
			DeployPlugin.getPluginIdentifier(), "icons/blank.png"); //$NON-NLS-1$
	private IProject project;

	public void init(IWorkbench workbench, IStructuredSelection selection)
	{
		Object element = selection.getFirstElement();
		if (element instanceof IResource)
		{
			IResource resource = (IResource) element;
			this.project = resource.getProject();
		}
		setDefaultPageImageDescriptor(fgDefaultImage);
	}

	public IProject getProject()
	{
		return this.project;
	}

}
