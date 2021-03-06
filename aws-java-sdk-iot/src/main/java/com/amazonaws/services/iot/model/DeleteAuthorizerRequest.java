/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAuthorizerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the authorizer to delete.
     * </p>
     */
    private String authorizerName;

    /**
     * <p>
     * The name of the authorizer to delete.
     * </p>
     * 
     * @param authorizerName
     *        The name of the authorizer to delete.
     */

    public void setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
    }

    /**
     * <p>
     * The name of the authorizer to delete.
     * </p>
     * 
     * @return The name of the authorizer to delete.
     */

    public String getAuthorizerName() {
        return this.authorizerName;
    }

    /**
     * <p>
     * The name of the authorizer to delete.
     * </p>
     * 
     * @param authorizerName
     *        The name of the authorizer to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAuthorizerRequest withAuthorizerName(String authorizerName) {
        setAuthorizerName(authorizerName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAuthorizerName() != null)
            sb.append("AuthorizerName: ").append(getAuthorizerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAuthorizerRequest == false)
            return false;
        DeleteAuthorizerRequest other = (DeleteAuthorizerRequest) obj;
        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAuthorizerRequest clone() {
        return (DeleteAuthorizerRequest) super.clone();
    }

}
