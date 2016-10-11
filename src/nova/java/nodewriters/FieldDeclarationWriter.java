package nova.java.nodewriters;

import net.fathomsoft.nova.tree.variables.FieldDeclaration;

public abstract class FieldDeclarationWriter extends InstanceDeclarationWriter
{
	public abstract FieldDeclaration node();
}